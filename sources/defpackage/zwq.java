package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwq implements zsq {
    public final Context a;
    public final ajjc b;
    private final asnh c;
    private final athc d;

    public zwq(Context context, ajjc ajjcVar, asnh asnhVar, athc athcVar) {
        context.getClass();
        ajjcVar.getClass();
        this.a = context;
        this.b = ajjcVar;
        this.c = asnhVar;
        this.d = athcVar;
    }

    @Override // defpackage.zsq
    public final /* bridge */ /* synthetic */ dnoq a(zsu zsuVar) {
        zwr zwrVar = (zwr) zsuVar;
        String string = this.a.getString(R.string.message_bubble_satellite_failure_media);
        string.getClass();
        dlvx dlvxVar = new dlvx(string, this.a.getString(R.string.message_bubble_more_info_subtitle), zwrVar.b);
        dlze dlzeVar = new dlze(this.c.a(), this.d.a());
        ffix ffixVar = new ffix() { // from class: zwn
            @Override // defpackage.ffix
            public final Object invoke() {
                final zwq zwqVar = zwq.this;
                zwqVar.b.d(true, new ffji() { // from class: zwo
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ajiy ajiyVar = (ajiy) obj;
                        ajiyVar.getClass();
                        zwq zwqVar2 = zwq.this;
                        String string2 = zwqVar2.a.getString(R.string.message_bubble_satellite_failure_media_popup_title);
                        string2.getClass();
                        Context context = zwqVar2.a;
                        String string3 = context.getString(R.string.message_bubble_satellite_failure_media_popup_body);
                        ffel ffelVar = ffel.a;
                        String string4 = context.getString(R.string.message_bubble_satellite_failure_media_popup_dismiss);
                        string4.getClass();
                        return new dmvi(string2, ffelVar, string3, null, null, new doas(string4, new zwp(ajiyVar)), null, 88);
                    }
                });
                return true;
            }
        };
        return new dlzf(dlvxVar, dlzeVar, zwrVar.b, zwrVar.a, ffixVar, 32);
    }
}
