package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhuu {
    public static dhre a(dhre dhreVar) {
        if (!dhreVar.l()) {
            throw new IllegalArgumentException("Task is not complete:".concat(dhreVar.toString()));
        }
        if (dhreVar.m()) {
            throw new IllegalArgumentException("Task is successful:".concat(dhreVar.toString()));
        }
        if (!((dhrm) dhreVar).d) {
            Exception h = dhreVar.h();
            return h != null ? dhrt.b(h) : dhrt.b(new IllegalStateException("Task was not successful or canceled, but exception is null"));
        }
        dhrm dhrmVar = new dhrm();
        dhrmVar.x();
        return dhrmVar;
    }
}
