package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class aqdc extends ffkh implements ffji {
    public static final aqdc a = new aqdc();

    public aqdc() {
        super(1, MessagePartData.class, "isEndOfEmergency", "isEndOfEmergency()Z", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MessagePartData messagePartData = (MessagePartData) obj;
        messagePartData.getClass();
        return Boolean.valueOf(messagePartData.bi());
    }
}
