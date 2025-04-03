package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oiu extends ffkk implements ffji {
    final /* synthetic */ ffjm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oiu(ffjm ffjmVar) {
        super(1);
        this.a = ffjmVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        weakReference.getClass();
        boolean z = true;
        if (weakReference.get() != null && weakReference.get() != this.a) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
