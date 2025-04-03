package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqw {
    public final String a;
    public final lqt b;
    public final lqs c;
    public final lqz d;
    public final lqn e;
    public final lqu f;

    static {
        new lql().a();
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
        lvf.N(5);
    }

    public lqw(String str, lqo lqoVar, lqt lqtVar, lqs lqsVar, lqz lqzVar, lqu lquVar) {
        this.a = str;
        this.b = lqtVar;
        this.c = lqsVar;
        this.d = lqzVar;
        this.e = lqoVar;
        this.f = lquVar;
    }

    public static lqw a(Uri uri) {
        lql lqlVar = new lql();
        lqlVar.a = uri;
        return lqlVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqw)) {
            return false;
        }
        lqw lqwVar = (lqw) obj;
        String str = this.a;
        String str2 = lqwVar.a;
        int i = lvf.a;
        return Objects.equals(str, str2) && this.e.equals(lqwVar.e) && Objects.equals(this.b, lqwVar.b) && Objects.equals(this.c, lqwVar.c) && Objects.equals(this.d, lqwVar.d) && Objects.equals(this.f, lqwVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lqt lqtVar = this.b;
        return (((((((hashCode + (lqtVar != null ? lqtVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode()) * 31;
    }
}
