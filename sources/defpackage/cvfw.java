package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfw {
    public static final boolean a(MessageCoreData messageCoreData) {
        Optional a = cglt.a(messageCoreData.ar());
        try {
            if (a.isPresent()) {
                if (ffpc.j(new URL((String) a.get()).getHost(), "duo.app.goo.gl", true)) {
                    return true;
                }
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }
}
