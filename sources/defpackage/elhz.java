package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.apps.tiktok.tracing.debug.DebugTraceWaterfallActivity;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.eljo;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elhz implements ellh {
    final /* synthetic */ elhy a;

    public elhz(elhy elhyVar) {
        this.a = elhyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        elhy elhyVar = this.a;
        Intent intent = new Intent(elhyVar.a, (Class<?>) DebugTraceWaterfallActivity.class);
        Bundle bundle = new Bundle(1);
        eljz eljzVar = (eljz) elka.a.createBuilder();
        eljy a = ((eljo.a) ellfVar).a();
        eljzVar.copyOnWrite();
        elka elkaVar = (elka) eljzVar.instance;
        elkaVar.c = a;
        elkaVar.b |= 1;
        ProtoParsers.k(bundle, "trace_waterfall", eljzVar.build());
        intent.putExtras(bundle);
        eldl.p(elhyVar.a, intent);
        return elli.a;
    }
}
