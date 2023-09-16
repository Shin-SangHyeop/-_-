1. 중복된 문자가 없는것이 좋은 문자열이다 좋은 문자열을 만들수있는 최대 개수
abac => "a", "b", "c", "ab", "ba", "ac", "bac"      result = 7
abcd => "a", "b", "c", "d", "ab", "bc", "cd", "abc", "bcd", "abcd"   result=10
xyxyx => "x", "y", "xy", "yx"  result=4


테스트케이스 내가 임의적으로 추가
abcde => "a", "b", "c", "d", "e", "ab", "bc", "cd", "de", "abc", "bcd", "cde", "abcd", "bcde", "abcde"  result=15
abecde =>"a", "b", "e", "c", "d", "ab", "be", "ec", "cd", "de", "abe", "bec", "ecd", "cde", "abec", "becd", "abecd" result=17
afeaea => "a", "f", "e", "af", "fe", "ea", "ae", "afe", "fea" => result=9
afafafeeqeq => "a", "f", "e", "q", "af", "fa", "fe", "eq", "qe", "afe => result=10
