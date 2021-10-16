package datastructures;

//A simple definition for a DVD.
public class DVD {
	public String name;
	public int releaseYear;
	public String director;

	public static void main(String[] args) {
		// The actual code for creating an Array to hold DVD's.
		DVD[] dvdCollection = new DVD[15];

		DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");

		dvdCollection[2] = avengersDVD;

	}

	public DVD(String name, int releaseYear, String director) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.director = director;
	}

	public String toString() {
		System.out.println(this.name + ", directed by " + this.director + ", releasein " + this.releaseYear);
		return name + ", directed by " + director + ", released in " + releaseYear;
	}

	class Solution {
		public int findMaxConsecutiveOnes(int[] nums) {
			int max = 0;
			int sum = 0;
			for (int n : nums) {
				if (n == 1) {
					sum = sum + 1;
				} else if (n == 0) {
					sum = 0;
				}

				if (max < sum) {
					max = sum;
				}
			}
			return max;
		}
	}

}