package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bss implements bsu {
    final /* synthetic */ Context a;
    final /* synthetic */ bsv b;

    public bss(bsv bsvVar, Context context) {
        this.b = bsvVar;
        this.a = context;
    }

    @Override // defpackage.bsu
    public final bvu a(bve bveVar, Executor executor) {
        return new bvu(bveVar, executor, this.a);
    }
}
