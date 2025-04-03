package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oit extends ffkk implements ffji {
    final /* synthetic */ oil a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oit(oil oilVar) {
        super(1);
        this.a = oilVar;
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
