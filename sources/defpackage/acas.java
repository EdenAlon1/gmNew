package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acas extends acbo {
    private final acbn a;
    private final String b;
    private final long c;

    public acas(acbn acbnVar, String str, long j) {
        this.a = acbnVar;
        if (str == null) {
            throw new NullPointerException("Null timeText");
        }
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.acbo
    public final long a() {
        return this.c;
    }

    @Override // defpackage.acbo
    public final acbn b() {
        return this.a;
    }

    @Override // defpackage.acbo
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acbo) {
            acbo acboVar = (acbo) obj;
            if (this.a.equals(acboVar.b()) && this.b.equals(acboVar.c()) && this.c == acboVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "DateTimePickerPresetOptionData{resource=" + this.a.toString() + ", timeText=" + this.b + ", timeInMills=" + this.c + "}";
    }
}
