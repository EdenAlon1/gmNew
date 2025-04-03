package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvn {
    public final boolean a;
    public final List b;
    public final ahvx c;
    public final dotb d;
    public final ahvm e;

    public ahvn(boolean z, List list, ahvx ahvxVar, dotb dotbVar, ahvm ahvmVar) {
        list.getClass();
        dotbVar.getClass();
        this.a = z;
        this.b = list;
        this.c = ahvxVar;
        this.d = dotbVar;
        this.e = ahvmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahvn)) {
            return false;
        }
        ahvn ahvnVar = (ahvn) obj;
        return this.a == ahvnVar.a && ffkj.e(this.b, ahvnVar.b) && ffkj.e(this.c, ahvnVar.c) && ffkj.e(this.d, ahvnVar.d) && ffkj.e(this.e, ahvnVar.e);
    }

    public final int hashCode() {
        return ((((((((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "EditMessageUiData(isOpened=" + this.a + ", selectedRecipients=" + this.b + ", bottomContentUiData=" + this.c + ", topAppBarUiData=" + this.d + ", flags=" + this.e + ")";
    }
}
