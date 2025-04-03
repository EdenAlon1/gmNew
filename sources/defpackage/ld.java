package defpackage;

import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ld {
    public static final engf a;

    static {
        engd engdVar = new engd();
        engdVar.d(0, "*");
        engdVar.d(3, "us-ascii");
        engdVar.d(4, "iso-8859-1");
        engdVar.d(5, "iso-8859-2");
        engdVar.d(6, "iso-8859-3");
        engdVar.d(7, "iso-8859-4");
        engdVar.d(8, "iso-8859-5");
        engdVar.d(9, "iso-8859-6");
        engdVar.d(10, "iso-8859-7");
        engdVar.d(11, "iso-8859-8");
        engdVar.d(12, "iso-8859-9");
        engdVar.d(17, "shift_JIS");
        engdVar.d(18, "euc-jp");
        engdVar.d(38, "euc-kr");
        engdVar.d(39, "iso-2022-jp");
        engdVar.d(40, "iso-2022-jp-2");
        engdVar.d(106, "utf-8");
        engdVar.d(113, "gbk");
        engdVar.d(114, "gb18030");
        engdVar.d(2025, "gb2312");
        engdVar.d(2026, "big5");
        engdVar.d(1000, "iso-10646-ucs-2");
        engdVar.d(1015, "utf-16");
        engdVar.d(2085, "hz-gb-2312");
        a = engdVar.c();
    }

    public static String a(int i) {
        String str = (String) a.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new UnsupportedEncodingException();
    }
}
