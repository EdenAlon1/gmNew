package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizp {
    public final diza a;
    public final diza b;
    public final diza c;
    public final diza d;
    public final diza e;
    public final diza f;
    public final diza g;
    public final diza h;
    public final diza i;
    public final diza j;

    public dizp(dizq dizqVar) {
        this.a = dizqVar.i("enable_cema", false);
        this.b = dizqVar.f("wait_for_failure_response_timeout_seconds", 30);
        this.c = dizqVar.f("connection_init_timeout_seconds", 15);
        this.d = dizqVar.i("enable_discard_duplicate_messages", false);
        this.e = dizqVar.i("outgoing_chat_is_active_passive", false);
        this.f = dizqVar.i("enable_rfc6135_compliance", false);
        this.g = dizqVar.i("enable_report_to_imdn_translation", false);
        this.h = dizqVar.f("max_content_per_msrp_chunk_size", 61536);
        this.i = dizqVar.f("slm_max_content_per_msrp_chunk_size", 1048576);
        this.j = dizqVar.i("enable_recording_io_streams", false);
    }
}
