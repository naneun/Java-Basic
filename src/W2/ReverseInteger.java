class ReverseInteger {
    public int reverse(int x) {
        int ret = 0;
        try {
            StringBuilder sb = null;
            String str = Integer.toString(x);
            sb = new StringBuilder(str.substring(x >= 0 ? 0 : 1));
            if (x < 0) {
                sb.append("-");
            }
            str = sb.reverse().toString();
            ret = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return ret;
        }
        return ret;
    }
}