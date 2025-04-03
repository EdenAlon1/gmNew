package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csvh extends ensn {
    public csvh() {
        super("intent", Intent.class, false);
    }

    @Override // defpackage.ensn
    public final /* bridge */ /* synthetic */ void a(Object obj, ensm ensmVar) {
        Bundle extras;
        Intent intent = (Intent) obj;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        for (String str : extras.keySet()) {
            Object obj2 = extras.get(str);
            ensmVar.a(this.a + "." + str, obj2 == null ? "null" : cskt.b(obj2.toString()));
        }
    }
}
