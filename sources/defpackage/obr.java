package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class obr implements nxs {
    private final Context a;
    private final obt b;
    private kw c;
    private ValueAnimator d;

    public obr(Context context, obt obtVar) {
        this.a = context;
        this.b = obtVar;
    }

    @Override // defpackage.nxs
    public final void a(nzh nzhVar, Bundle bundle) {
        CharSequence stringBuffer;
        String valueOf;
        ffcf ffcfVar;
        nzhVar.getClass();
        if (nzhVar instanceof oav) {
            return;
        }
        Context context = this.a;
        CharSequence charSequence = nzhVar.f;
        if (charSequence == null) {
            stringBuffer = null;
        } else {
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
            StringBuffer stringBuffer2 = new StringBuffer();
            Map a = bundle != null ? owr.a(bundle) : ffem.a;
            while (matcher.find()) {
                String group = matcher.group(1);
                if (group == null || !a.containsKey(group)) {
                    throw new IllegalArgumentException("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"');
                }
                matcher.appendReplacement(stringBuffer2, "");
                nxe nxeVar = (nxe) nzhVar.i.get(group);
                oab oabVar = nxeVar != null ? nxeVar.a : null;
                if (ffkj.e(oabVar, oab.b)) {
                    oab oabVar2 = oab.b;
                    bundle.getClass();
                    valueOf = context.getString(((Integer) oabVar2.b(bundle, group)).intValue());
                } else {
                    oabVar.getClass();
                    bundle.getClass();
                    valueOf = String.valueOf(oabVar.b(bundle, group));
                }
                valueOf.getClass();
                stringBuffer2.append(valueOf);
            }
            matcher.appendTail(stringBuffer2);
            stringBuffer = stringBuffer2.toString();
        }
        if (stringBuffer != null) {
            c(stringBuffer);
        }
        obt obtVar = this.b;
        Iterator a2 = nzb.b(nzhVar).a();
        while (a2.hasNext()) {
            nzh nzhVar2 = (nzh) a2.next();
            if (obtVar.a.contains(Integer.valueOf(nzhVar2.j))) {
                if (nzhVar2 instanceof nzl) {
                    int i = nzhVar.j;
                    int i2 = nzl.n;
                    if (i == nzj.b((nzl) nzhVar2).j) {
                    }
                }
                b(null, 0);
                return;
            }
        }
        kw kwVar = this.c;
        if (kwVar != null) {
            ffcfVar = new ffcf(kwVar, true);
        } else {
            kw kwVar2 = new kw(this.a);
            this.c = kwVar2;
            ffcfVar = new ffcf(kwVar2, false);
        }
        Object obj = ffcfVar.b;
        kw kwVar3 = (kw) ffcfVar.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b(kwVar3, R.string.nav_app_bar_navigate_up_description);
        if (!booleanValue) {
            kwVar3.setProgress(1.0f);
            return;
        }
        float f = kwVar3.a;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kwVar3, "progress", f, 1.0f);
        this.d = ofFloat;
        ofFloat.getClass();
        ofFloat.start();
    }

    protected abstract void b(Drawable drawable, int i);

    protected abstract void c(CharSequence charSequence);
}
