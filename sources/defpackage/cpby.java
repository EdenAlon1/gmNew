package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpby {
    private final Context a;
    private final ffbr b;
    private final ffbr c;

    public cpby(Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = context;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public final Context a(Context context, int i) {
        context.getClass();
        int[] a = ((csrw) this.c.b()).a(i);
        int i2 = 0;
        int i3 = a[0];
        int i4 = a[1];
        Configuration configuration = new Configuration();
        if (i3 != 0) {
            i2 = i3;
        } else if (i4 == 0) {
            Configuration configuration2 = context.getResources().getConfiguration();
            configuration.mcc = configuration2.mcc;
            configuration.mnc = configuration2.mnc;
            Context createConfigurationContext = context.createConfigurationContext(configuration);
            createConfigurationContext.getClass();
            return createConfigurationContext;
        }
        configuration.mcc = i2;
        configuration.mnc = i4;
        Context createConfigurationContext2 = context.createConfigurationContext(configuration);
        createConfigurationContext2.getClass();
        return createConfigurationContext2;
    }

    public final Bundle b(int i, int i2) {
        try {
            XmlResourceParser xml = a(this.a, i).getResources().getXml(i2);
            final Bundle bundle = new Bundle();
            try {
                cpav a = cpav.a(xml, (ctvb) this.b.b());
                a.a = new cpau() { // from class: cpbx
                    @Override // defpackage.cpau
                    public final void a(String str, Object obj, int i3) {
                        cpbn.z(bundle, i3, str, obj);
                    }
                };
                a.b();
                ffit.a(xml, null);
                return bundle;
            } finally {
            }
        } catch (Resources.NotFoundException e) {
            enrr enrrVar = (enrr) ((enrr) enru.c("com/google/android/apps/messaging/shared/sms/config/ResourceCarrierConfigLoader").j()).g(e);
            enrrVar.Y(ente.a, "Bugle");
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/sms/config/ResourceCarrierConfigLoader", "loadFromResources", 45, "ResourceCarrierConfigLoader.kt")).q("Cannot find mms_config.xml:");
            return new Bundle();
        }
    }
}
