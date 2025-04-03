package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikt implements aigt {
    private final Activity a;
    private final ffbr b;
    private final Optional c;
    private final ddxv d;

    public aikt(Activity activity, ffbr ffbrVar, Optional optional, ddxv ddxvVar) {
        optional.getClass();
        this.a = activity;
        this.b = ffbrVar;
        this.c = optional;
        this.d = ddxvVar;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        aiks aiksVar = (aiks) aihsVar;
        if (this.c.isPresent() && le.g(aiksVar.b)) {
            Uri b = cbgl.b(this.a, aiksVar.a, aiksVar.c, aiksVar.b, aiksVar.d);
            if (le.m(aiksVar.b)) {
                ((akvg) this.b.b()).C(this.a, b, aiksVar.b);
            } else {
                ((tap) this.c.get()).b(this.a, b);
            }
            return ffcu.a;
        }
        if (!le.v(aiksVar.b)) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(aiksVar.a, aiksVar.b);
            if (intent.resolveActivity(this.a.getPackageManager()) == null) {
                if (aiksVar.e) {
                    ddxv ddxvVar = this.d;
                    Activity activity = this.a;
                    Uri uri = aiksVar.a;
                    ddxvVar.a(activity, uri, aiksVar.b, uri, aiksVar.c);
                }
                return ffcu.a;
            }
        }
        String a = le.a(aiksVar.b);
        ((akvg) this.b.b()).C(this.a, cbgl.b(this.a, aiksVar.a, aiksVar.c, aiksVar.b, aiksVar.d), a);
        return ffcu.a;
    }
}
