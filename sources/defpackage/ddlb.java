package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddlb extends ddld {
    private final ddlo a;

    public ddlb(ddlo ddloVar) {
        this.a = ddloVar;
    }

    @Override // defpackage.ddld
    public final ddlo a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ddld) {
            return this.a.equals(((ddld) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ReminderDateTimePickerEvent{reminderDialogData=" + this.a.toString() + "}";
    }
}
