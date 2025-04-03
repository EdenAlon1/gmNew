package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdja implements bdiz {
    public final MessageCoreData a;

    public bdja(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.bdiz
    public final /* synthetic */ Object a(ffji ffjiVar, ffji ffjiVar2) {
        return bdiy.a(this, ffjiVar, ffjiVar2);
    }

    @Override // defpackage.bdiz
    public final /* synthetic */ boolean b() {
        return bdiy.b(this);
    }

    @Override // defpackage.bdiz
    public final boolean c() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdja) && ffkj.e(this.a, ((bdja) obj).a);
    }

    public final int hashCode() {
        MessageCoreData messageCoreData = this.a;
        if (messageCoreData == null) {
            return 0;
        }
        return messageCoreData.hashCode();
    }

    public final String toString() {
        return "NullableMessageCoreData(messageCoreData=" + this.a + ")";
    }
}
