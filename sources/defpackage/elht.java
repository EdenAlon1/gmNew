package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.apps.tiktok.tracing.debug.DebugTraceWaterfallActivity;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.eljo;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elht implements ellh {
    final /* synthetic */ elhs a;

    public elht(elhs elhsVar) {
        this.a = elhsVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        elhs elhsVar = this.a;
        eljo.a aVar = (eljo.a) ellfVar;
        Intent intent = new Intent(elhsVar.a, (Class<?>) DebugTraceWaterfallActivity.class);
        Bundle bundle = new Bundle(1);
        eljz eljzVar = (eljz) elka.a.createBuilder();
        eljy a = aVar.a();
        eljzVar.copyOnWrite();
        elka elkaVar = (elka) eljzVar.instance;
        elkaVar.c = a;
        elkaVar.b = 1 | elkaVar.b;
        eljw eljwVar = (eljw) elhsVar.d.get(aVar.a().c);
        eljzVar.copyOnWrite();
        elka elkaVar2 = (elka) eljzVar.instance;
        eljwVar.getClass();
        elkaVar2.d = eljwVar;
        elkaVar2.b |= 2;
        ProtoParsers.k(bundle, "trace_waterfall", eljzVar.build());
        intent.putExtras(bundle);
        eldl.p(elhsVar.a, intent);
        return elli.a;
    }
}
