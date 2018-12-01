import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Functions
{
	public static boolean checksorted(char[] array)
	{
		boolean value = true;
		if (array != null && array.length > 0)
		{
			char pre_num = array[0];
			for (int i = 1; i < array.length; i++)
			{
				char stat = array[i];
				if (stat < pre_num)
				{
					value = false;
					break;
				}
				pre_num = stat;
			}
		} else
			value = false;
		return value;
	}

	public static int countPrimes(int[] a)
	{
		int counter = 0;
		boolean flag = true;
		for (int i = 0; i < a.length; i++)
		{
			flag = true;
			int n = a[i];
			for (int j = 2; j <= n / 2; ++j)
			{
				if (n % j == 0)
				{
					flag = false;
					break;
				}
			}
			if ((n == 0) || (n == 1))
			{
				flag = false;
			}
			if (flag)
			{
				counter++;
			}
		}
		return counter;
	}

	public static ArrayList<String> DistnictArray(String[] a)
	{
		ArrayList<String> Arr = new ArrayList<String>();
		for (int i = 0; i < a.length; i++)
		{
			if (!Arr.contains(a[i]))
			{
				Arr.add(a[i]);
			}
		}
		return Arr;

	}

	public static double Get_median(String[] nums)
	{
		int n = nums.length;
		int[] Nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			Nums[i] = Integer.parseInt(nums[i]);
		}
		Arrays.sort(Nums);
		if (n % 2 != 0)
			return (double) Nums[n / 2];
		return (double) (Nums[(n - 1) / 2] + Nums[n / 2]) / 2.0;
	}

	public static void Max_three_number(char[] Array)
	{
		int len = Array.length;
		char[] B = new char[len];
		for (int i = 0; i < len; i++)
		{
			B[i] = Array[i];
		}
		Arrays.sort(B);
		int x;
		if (len == 0 || len == 1)
		{
			x = 1;
		} else
		{
			int k = 0;
			for (int i = 0; i < len - 1; i++)
			{
				if (B[i] != B[i + 1])
				{
					B[k++] = B[i];
				}
			}
			B[k++] = B[len - 1];
			x = k;
		}
		char[] C = new char[x];
		for (int i = 0; i < x; i++)
		{
			C[i] = B[i];
		}
		System.out.println(C[C.length - 1] + "\n" + C[C.length - 2] + "\n" + C[C.length - 3]);
	}

	public static char most_repeated_value(char[] array)
	{
		int counter = 1, tempCount;
		char Temp, most_repeated = array[0];

		for (int i = 0; i < array.length - 1; i++)
		{
			Temp = array[i];
			tempCount = 0;
			for (int j = 1; j < array.length; j++)
			{
				if (Temp == array[j])
					tempCount++;
			}
			if (tempCount > counter)
			{
				most_repeated = Temp;
				counter = tempCount;
			}
		}
		return most_repeated;
	}

	public static char[] ROP(char arr[])
	{
		int i, m = 0, n, flag, counter = 0, c = 0;

		for (int k = 0; k < arr.length; k++)
		{
			n = Character.getNumericValue(arr[k]);
			flag = 0;
			m = n / 2;
			if (n == 0 || n == 1)
			{
				continue;
			} else
			{
				for (i = 2; i <= m; i++)
				{
					if (n % i == 0)
					{
						flag = 1;
						continue;
					}
				}
				if (flag == 0)
				{
					counter++;
				}
			} // end of else
		}
		char[] out = new char[counter];
		for (int k = 0; k < arr.length; k++)
		{
			flag = 0;
			n = Character.getNumericValue(arr[k]);
			m = n / 2;
			if (n == 0 || n == 1)
			{
				continue;
			} else
			{
				for (i = 2; i <= m; i++)
				{
					if (n % i == 0)
					{
						flag = 1;
						continue;
					}
				}
				if (flag == 0)
				{
					out[c++] = arr[k];
				}
			}
		}

		return out;
	}

	public static char[] shuffleArray(char[] a)
	{
		char[] out = new char[a.length];
		for (int i = 0; i < out.length; i++)
		{
			out[i] = a[i];
		}
		int n = out.length;
		Random random = new Random();
		random.nextInt();
		for (int i = 0; i < n; i++)
		{
			int rand = random.nextInt(n);
			char tmp = out[i];
			out[i] = out[rand];
			out[rand] = tmp;
		}
		return out;
	}

	public static void Get_Min_3_Num(String[] arr)
	{
		int n1 = Integer.valueOf(arr[1]);
		int n2 = Integer.valueOf(arr[1]);
		int n3 = Integer.valueOf(arr[1]);
		int x = 0;
		int y = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (Integer.valueOf(arr[i]) < n1)
			{
				n1 = Integer.valueOf(arr[i]);
				x = i;
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (Integer.valueOf(arr[i]) < n2 && i != x)
			{
				n2 = Integer.valueOf(arr[i]);
				y = i;
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (Integer.valueOf(arr[i]) < n3 && i != y && i != x)
			{
				n3 = Integer.valueOf(arr[i]);
			}
		}

		System.out.printf("The Minimum Tree Number : %d , %d , %d \n", n1, n2, n3);
	}
	
	public static boolean IsPalindrome(char[] data)
	{
		for(int i = 0; i < data.length; i++)
		{
			for(int j = data.length; j >= i; j--)
			{
				if(data[i] != data[j])
					return false;
			}
		}
		
		return true;
	}
}
