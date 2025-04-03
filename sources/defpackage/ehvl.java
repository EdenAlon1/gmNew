package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvl extends ehuz {
    public final int a;

    public ehvl(int i) {
        this.a = i;
    }

    @Override // defpackage.ehuz
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehuz) {
            ehuz ehuzVar = (ehuz) obj;
            if (this.a == ehuzVar.a()) {
                ehuzVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.a + ", allowAssetPackDeletion=false}";
    }

    @Override // defpackage.ehuz
    public final void c() {
    }
}
