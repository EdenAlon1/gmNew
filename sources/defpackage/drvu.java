package defpackage;

import android.view.View;
import android.widget.Button;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drvu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drwc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drvu(drwc drwcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drwcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drvu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            drwd drwdVar = this.b.aj;
            if (drwdVar == null) {
                ffkj.c("preferences");
                drwdVar = null;
            }
            this.a = 1;
            aetb aetbVar = (aetb) drwdVar;
            obj = ffra.a(ekxi.a(aetbVar.b), new aesx(null, aetbVar), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            final drwc drwcVar = this.b;
            Button a = drwcVar.ba().a();
            String string = a.getResources().getString(R.string.gallery_google_photos_option_tray_button_just_once);
            string.getClass();
            drvq.a(a, string);
            a.setOnClickListener(new View.OnClickListener() { // from class: drvn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    drwc drwcVar2 = drwc.this;
                    ffqy.d(lks.a(drwcVar2), null, null, new drvz(drwcVar2, null), 3);
                }
            });
            Button b = drwcVar.ba().b();
            String string2 = b.getResources().getString(R.string.gallery_google_photos_option_tray_button_always);
            string2.getClass();
            drvq.a(b, string2);
            b.setOnClickListener(new View.OnClickListener() { // from class: drvo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    drwc drwcVar2 = drwc.this;
                    ffqy.d(lks.a(drwcVar2), null, null, new drwb(drwcVar2, null), 3);
                }
            });
        } else {
            final drwc drwcVar2 = this.b;
            Button a2 = drwcVar2.ba().a();
            String string3 = a2.getResources().getString(R.string.gallery_google_photos_option_tray_button_cancel);
            string3.getClass();
            drvq.a(a2, string3);
            a2.setOnClickListener(new View.OnClickListener() { // from class: drvj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    drwc drwcVar3 = drwc.this;
                    ffqy.d(lks.a(drwcVar3), null, null, new drvv(drwcVar3, null), 3);
                }
            });
            Button b2 = drwcVar2.ba().b();
            String string4 = b2.getResources().getString(R.string.gallery_google_photos_option_tray_button_add);
            string4.getClass();
            drvq.a(b2, string4);
            b2.setOnClickListener(new View.OnClickListener() { // from class: drvk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    drwc drwcVar3 = drwc.this;
                    ffqy.d(lks.a(drwcVar3), null, null, new drvx(drwcVar3, null), 3);
                }
            });
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drvu(this.b, ffguVar);
    }
}
