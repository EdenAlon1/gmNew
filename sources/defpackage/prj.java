package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prj extends ovj {
    public static final prj c = new prj();

    private prj() {
        super(12, 13);
    }

    @Override // defpackage.ovj
    public final void a(oxi oxiVar) {
        oxiVar.g("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        oxiVar.g("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
