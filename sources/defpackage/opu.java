package defpackage;

import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opu extends orc {
    final vk a;
    private final oqf b;
    private final ksp c;

    public opu(ord ordVar, oqf oqfVar, vk vkVar, ksp kspVar) {
        ordVar.a(this);
        ksw.a(true);
        ksw.a(vkVar != null);
        ksw.a(true);
        this.b = oqfVar;
        this.a = vkVar;
        this.c = kspVar;
    }

    @Override // defpackage.orc
    public final void a(Object obj, boolean z) {
        int a = this.b.a(obj);
        if (a >= 0) {
            this.c.accept(new opt(this, a));
        } else {
            Objects.toString(obj);
            Log.w("EventsRelays", "Item change notification received for unknown item: ".concat(String.valueOf(obj)));
        }
    }
}
