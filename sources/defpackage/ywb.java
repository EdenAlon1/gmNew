package defpackage;

import com.google.research.xeno.effect.Control;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ywb extends dpdv {
    public ywb() {
        super(null);
    }

    @Override // defpackage.dpdv
    public final void a(Map map) {
        Control.FloatSetting floatSetting;
        Control control = (Control) map.get("wet_ratio");
        if (control == null || (floatSetting = control.a) == null) {
            return;
        }
        float f = true != ((Boolean) this.b.c()).booleanValue() ? 0.0f : 1.0f;
        Control.nativeGetFloatValue(floatSetting.b);
        Control.nativeSetFloatValue(floatSetting.b, f);
        Iterator it = floatSetting.a.iterator();
        while (it.hasNext()) {
            ((facy) it.next()).a();
        }
    }
}
