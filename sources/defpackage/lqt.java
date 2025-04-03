package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqt {
    public final Uri a;
    public final String b;
    public final lqq c;
    public final List e;
    public final engw g;
    public final Object h;
    public final long i;
    public final lqk d = null;
    public final String f = null;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
        lvf.N(5);
        lvf.N(6);
        lvf.N(7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lqt(Uri uri, String str, lqq lqqVar, List list, engw engwVar, long j) {
        this.a = uri;
        this.b = lre.f(str);
        this.c = lqqVar;
        this.e = list;
        this.g = engwVar;
        int i = engw.d;
        engr engrVar = new engr();
        if (((enou) engwVar).c > 0) {
            throw null;
        }
        engrVar.g();
        this.h = null;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqt)) {
            return false;
        }
        lqt lqtVar = (lqt) obj;
        if (this.a.equals(lqtVar.a)) {
            String str = this.b;
            String str2 = lqtVar.b;
            int i = lvf.a;
            if (Objects.equals(str, str2) && Objects.equals(this.c, lqtVar.c)) {
                lqk lqkVar = lqtVar.d;
                if (Objects.equals(null, null) && this.e.equals(lqtVar.e)) {
                    String str3 = lqtVar.f;
                    if (Objects.equals(null, null) && enkr.h(this.g, lqtVar.g)) {
                        Object obj2 = lqtVar.h;
                        if (Objects.equals(null, null) && Objects.equals(Long.valueOf(this.i), Long.valueOf(lqtVar.i))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        return (int) (((((((hashCode2 + (this.c != null ? r1.hashCode() : 0)) * 961) + this.e.hashCode()) * 961) + this.g.hashCode()) * 31 * 31) + this.i);
    }
}
