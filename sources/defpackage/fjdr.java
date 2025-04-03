package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjdr {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern b = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String c;
    public final fhgk d;
    public String e;
    public fhgi f;
    public final fhgu g = new fhgu();
    public final fhgf h;
    public fhgn i;
    public final boolean j;
    public fhgo k;
    public fhfz l;
    public fhgz m;

    public fjdr(String str, fhgk fhgkVar, String str2, fhgh fhghVar, fhgn fhgnVar, boolean z, boolean z2, boolean z3) {
        this.c = str;
        this.d = fhgkVar;
        this.e = str2;
        this.i = fhgnVar;
        this.j = z;
        if (fhghVar != null) {
            this.h = fhghVar.e();
        } else {
            this.h = new fhgf();
        }
        if (z2) {
            this.l = new fhfz();
            return;
        }
        if (z3) {
            fhgo fhgoVar = new fhgo();
            this.k = fhgoVar;
            fhgn fhgnVar2 = fhgq.b;
            fhgnVar2.getClass();
            if (ffkj.e(fhgnVar2.d, "multipart")) {
                fhgoVar.b = fhgnVar2;
            } else {
                Objects.toString(fhgnVar2);
                throw new IllegalArgumentException("multipart != ".concat(fhgnVar2.c));
            }
        }
    }

    final void a(String str, String str2, boolean z) {
        if (z) {
            fhfz fhfzVar = this.l;
            List list = fhfzVar.a;
            char[] cArr = fhgk.a;
            list.add(fhgj.e(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            fhfzVar.b.add(fhgj.e(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            return;
        }
        fhfz fhfzVar2 = this.l;
        List list2 = fhfzVar2.a;
        char[] cArr2 = fhgk.a;
        list2.add(fhgj.e(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
        fhfzVar2.b.add(fhgj.e(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
    }

    final void b(String str, String str2) {
        if (!fhpi.a.equalsIgnoreCase(str)) {
            this.h.e(str, str2);
            return;
        }
        try {
            Pattern pattern = fhgn.a;
            this.i = fhgm.a(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Malformed content type: ".concat(String.valueOf(str2)), e);
        }
    }

    final void c(fhgh fhghVar, fhgz fhgzVar) {
        fhgo fhgoVar = this.k;
        fhgzVar.getClass();
        if (fhghVar.b(fhpi.a) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (fhghVar.b("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        fhgoVar.a(new fhgp(fhghVar, fhgzVar));
    }

    final void d(String str, String str2, boolean z) {
        String str3 = this.e;
        if (str3 != null) {
            fhgi i = this.d.i(str3);
            this.f = i;
            if (i == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + String.valueOf(this.d) + ", Relative: " + this.e);
            }
            this.e = null;
        }
        if (z) {
            fhgi fhgiVar = this.f;
            str.getClass();
            if (fhgiVar.g == null) {
                fhgiVar.g = new ArrayList();
            }
            List list = fhgiVar.g;
            list.getClass();
            char[] cArr = fhgk.a;
            list.add(fhgj.e(str, 0, 0, " \"'<>#&=", true, false, true, false, 211));
            List list2 = fhgiVar.g;
            list2.getClass();
            list2.add(str2 != null ? fhgj.e(str2, 0, 0, " \"'<>#&=", true, false, true, false, 211) : null);
            return;
        }
        fhgi fhgiVar2 = this.f;
        str.getClass();
        if (fhgiVar2.g == null) {
            fhgiVar2.g = new ArrayList();
        }
        List list3 = fhgiVar2.g;
        list3.getClass();
        char[] cArr2 = fhgk.a;
        list3.add(fhgj.e(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        List list4 = fhgiVar2.g;
        list4.getClass();
        list4.add(str2 != null ? fhgj.e(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219) : null);
    }
}
