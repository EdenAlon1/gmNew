package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.vcard.VCardConfig;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
@oag(a = "activity")
/* loaded from: classes.dex */
public class nwo extends oaj<nwm> {
    private final Context b;
    private final Activity c;

    public nwo(Context context) {
        Object obj;
        this.b = context;
        Iterator a = ffno.e(context, nwn.a).a();
        while (true) {
            if (!a.hasNext()) {
                obj = null;
                break;
            } else {
                obj = a.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.c = (Activity) obj;
    }

    @Override // defpackage.oaj
    public final /* synthetic */ nzh a() {
        return new nwm(this);
    }

    @Override // defpackage.oaj
    public final boolean b() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // defpackage.oaj
    public final /* bridge */ /* synthetic */ nzh c(nzh nzhVar, Bundle bundle, nzr nzrVar) {
        Intent intent;
        int intExtra;
        String encode;
        nwm nwmVar = (nwm) nzhVar;
        Intent intent2 = nwmVar.a;
        if (intent2 == null) {
            throw new IllegalStateException("Destination " + nwmVar.j + " does not have an Intent set.");
        }
        Intent intent3 = new Intent(intent2);
        if (bundle != null) {
            intent3.putExtras(bundle);
            String str = nwmVar.b;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    group.getClass();
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    nxe nxeVar = (nxe) ffew.l(nwmVar.i).get(group);
                    oab oabVar = nxeVar != null ? nxeVar.a : null;
                    if (oabVar == null || (encode = oabVar.h(oabVar.b(bundle, group))) == null) {
                        encode = Uri.encode(String.valueOf(bundle.get(group)));
                    }
                    stringBuffer.append(encode);
                }
                matcher.appendTail(stringBuffer);
                intent3.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        if (this.c == null) {
            intent3.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        if (nzrVar != null && nzrVar.a) {
            intent3.addFlags(536870912);
        }
        Activity activity = this.c;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent3.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent3.putExtra("android-support-navigation:ActivityNavigator:current", nwmVar.j);
        Resources resources = this.b.getResources();
        if (nzrVar != null) {
            int i = nzrVar.h;
            int i2 = nzrVar.i;
            if ((i <= 0 || !ffkj.e(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !ffkj.e(resources.getResourceTypeName(i2), "animator"))) {
                intent3.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent3.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + nwmVar);
            }
        }
        this.b.startActivity(intent3);
        if (nzrVar != null && this.c != null) {
            int i3 = nzrVar.f;
            int i4 = nzrVar.g;
            if ((i3 > 0 && ffkj.e(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && ffkj.e(resources.getResourceTypeName(i4), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + nwmVar);
            } else if (i3 >= 0 || i4 >= 0) {
                this.c.overridePendingTransition(ffmk.f(i3, 0), ffmk.f(i4, 0));
            }
        }
        return null;
    }
}
