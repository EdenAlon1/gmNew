package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lci extends ffkk implements ffix {
    final /* synthetic */ File a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lci(File file) {
        super(0);
        this.a = file;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj = lcj.b;
        File file = this.a;
        synchronized (obj) {
            lcj.a.remove(file.getAbsolutePath());
        }
        return ffcu.a;
    }
}
