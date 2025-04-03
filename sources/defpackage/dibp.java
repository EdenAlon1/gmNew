package defpackage;

import android.content.Context;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient;
import com.google.android.gms.wearable.internal.ChannelImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dibp extends ChannelClient {
    public dibp(Context context, dfqz dfqzVar) {
        super(context, dfqzVar);
    }

    public static void b(Channel channel) {
        dfwv.o(channel, "channel must not be null");
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final dhre a(ChannelClient.Channel channel) {
        dfwv.o(channel, "channel must not be null");
        dfre dfreVar = this.k;
        dibs dibsVar = new dibs((ChannelImpl) channel, dfreVar);
        dfreVar.b(dibsVar);
        return dfwu.a(dibsVar, new dfwt() { // from class: dibn
            @Override // defpackage.dfwt
            public final Object a(dfrl dfrlVar) {
                return ((dibt) dfrlVar).a;
            }
        });
    }
}
