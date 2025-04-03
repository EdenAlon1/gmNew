package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eftv implements efts {
    private final efts a;

    public eftv(efts eftsVar) {
        this.a = eftsVar;
    }

    public static final int b(String str) {
        return str == null ? eftu.a[0] : eftu.a[Math.abs(str.hashCode()) % 21];
    }

    public final CharSequence a(ebte ebteVar) {
        String str;
        if (ebteVar != null) {
            int i = 0;
            while (true) {
                String[] strArr = ebteVar.a;
                if (i >= strArr.length) {
                    break;
                }
                String str2 = strArr[i];
                if (str2 == null || str2.isEmpty() || str2.equals(".")) {
                    str2 = null;
                } else if (str2.length() > 2) {
                    efua efuaVar = ((eftt) this.a).a;
                    emxf.l(efuaVar.e);
                    eftz eftzVar = (eftz) efuaVar.d.get();
                    if (eftzVar == null) {
                        str = null;
                    } else {
                        int length = str2.length();
                        str = null;
                        for (int i2 = 0; i2 < length && eftzVar != null; i2++) {
                            efty eftyVar = (efty) eftzVar.get(Character.valueOf(str2.charAt(i2)));
                            if (eftyVar == null) {
                                break;
                            }
                            String str3 = eftyVar.b;
                            if (str3 != null) {
                                str = str3;
                            }
                            eftzVar = eftyVar.a;
                        }
                    }
                    str2 = str == null ? new StringBuilder().appendCodePoint(str2.codePointAt(0)).toString() : str;
                }
                if (str2 != null) {
                    return str2;
                }
                i++;
            }
        }
        return null;
    }
}
