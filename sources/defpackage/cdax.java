package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdax extends cdbj {
    public final enhk a;
    public final enhk b;
    public final enhk c;

    public cdax(enhk enhkVar, enhk enhkVar2, enhk enhkVar3) {
        this.a = enhkVar;
        this.b = enhkVar2;
        this.c = enhkVar3;
    }

    @Override // defpackage.cdbj
    public final enhk a() {
        return this.b;
    }

    @Override // defpackage.cdbj
    public final enhk b() {
        return this.c;
    }

    @Override // defpackage.cdbj
    public final enhk c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdbj) {
            cdbj cdbjVar = (cdbj) obj;
            if (this.a.equals(cdbjVar.c()) && this.b.equals(cdbjVar.a()) && this.c.equals(cdbjVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        enhk enhkVar = this.c;
        enhk enhkVar2 = this.b;
        return "CmsBatchBackupFailedItems{failedParticipants=" + this.a.toString() + ", failedConversations=" + enhkVar2.toString() + ", failedMessages=" + enhkVar.toString() + "}";
    }
}
