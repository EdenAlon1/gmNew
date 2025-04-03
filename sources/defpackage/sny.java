package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sny {
    public final long a;
    public final MessageIdType b;
    public final long c;
    private final String d;

    public sny(long j, MessageIdType messageIdType, long j2, String str) {
        this.a = j;
        this.b = messageIdType;
        this.c = j2;
        this.d = str;
    }

    public final akcb a() {
        akca akcaVar = (akca) akcb.a.createBuilder();
        akcaVar.getClass();
        akcaVar.copyOnWrite();
        akcb akcbVar = (akcb) akcaVar.instance;
        akcbVar.b |= 1;
        akcbVar.c = this.a;
        akcaVar.copyOnWrite();
        akcb akcbVar2 = (akcb) akcaVar.instance;
        akcbVar2.b |= 2;
        akcbVar2.d = this.b.a;
        akcaVar.copyOnWrite();
        akcb akcbVar3 = (akcb) akcaVar.instance;
        akcbVar3.b |= 4;
        akcbVar3.e = this.c;
        eyfy build = akcaVar.build();
        build.getClass();
        return (akcb) build;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sny)) {
            return false;
        }
        sny snyVar = (sny) obj;
        return this.a == snyVar.a && ffkj.e(this.b, snyVar.b) && this.c == snyVar.c && ffkj.e(this.d, snyVar.d);
    }

    public final int hashCode() {
        int a = (snx.a(this.a) * 31) + this.b.hashCode();
        String str = this.d;
        return (((a * 31) + snx.a(this.c)) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BugleAttachmentBackupMetadata(id=" + this.a + ", messageId=" + this.b + ", sizeBytes=" + this.c + ", contentType=" + this.d + ")";
    }
}
