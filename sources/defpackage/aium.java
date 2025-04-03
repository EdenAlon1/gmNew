package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aium implements ejwd<Boolean> {
    public final ffbr a;
    public boolean b = false;
    public vk c;

    public aium(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!aewg.h() || bool == null || this.b == bool.booleanValue()) {
            return;
        }
        vk vkVar = this.c;
        vkVar.getClass();
        vkVar.p();
        this.b = bool.booleanValue();
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
    }
}
