package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bst implements bsu {
    final /* synthetic */ bsv a;

    public bst(bsv bsvVar) {
        this.a = bsvVar;
    }

    @Override // defpackage.bsu
    public final bvu a(bve bveVar, Executor executor) {
        return new bvu(bveVar, executor, null);
    }
}
