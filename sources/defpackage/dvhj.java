package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvhj extends dvhl {
    public final dvdt a;
    public final long b;

    public dvhj(dvdt dvdtVar, long j) {
        if (dvdtVar == null) {
            throw new NullPointerException("Null event");
        }
        this.a = dvdtVar;
        this.b = j;
    }

    @Override // defpackage.dvhl
    public final long a() {
        return this.b;
    }

    @Override // defpackage.dvhl
    public final dvdt b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvhl) {
            dvhl dvhlVar = (dvhl) obj;
            if (this.a.equals(dvhlVar.b())) {
                dvhlVar.c();
                if (this.b == dvhlVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (hashCode * (-721379959)) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ProcessingContext{event=" + this.a.toString() + ", accountName=null, eventTimeMs=" + this.b + "}";
    }

    @Override // defpackage.dvhl
    public final void c() {
    }
}
