package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahkd implements ejwd<Boolean> {
    public vk a;
    private final ahkc b;

    public ahkd(ahkc ahkcVar) {
        this.b = ahkcVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!aewg.h() || bool == null || this.b.b == bool.booleanValue()) {
            return;
        }
        vk vkVar = this.a;
        vkVar.getClass();
        vkVar.p();
        this.b.b = bool.booleanValue();
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
    }
}
