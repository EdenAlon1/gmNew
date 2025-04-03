package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alfe implements csib {
    private final alff a;

    public alfe(alff alffVar) {
        alffVar.getClass();
        this.a = alffVar;
    }

    @Override // defpackage.csib
    public final void c() {
        alff alffVar = this.a;
        ((ensz) alffVar.a.e()).q("Generating new sequence ID");
        alffVar.b = UUID.randomUUID().toString();
    }

    @Override // defpackage.csib
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.csib
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.csib
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.csib
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.csib
    public final /* synthetic */ void f() {
    }
}
