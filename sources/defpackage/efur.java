package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efur extends efut {
    public final emxc a;

    public efur(emxc emxcVar) {
        this.a = emxcVar;
    }

    @Override // defpackage.efut
    public final emxc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efut) {
            efut efutVar = (efut) obj;
            efutVar.b();
            if (this.a.equals(efutVar.a())) {
                efutVar.d();
                efutVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return -1390203796;
    }

    public final String toString() {
        return "PhotoPickerConfig{enablePastProfilePhotos=false, openToContentUrl=Optional.absent(), showAccountSnackBar=false, editInfoDialogMessageId=2132086001}";
    }

    @Override // defpackage.efut
    public final void b() {
    }

    @Override // defpackage.efut
    public final void c() {
    }

    @Override // defpackage.efut
    public final void d() {
    }
}
