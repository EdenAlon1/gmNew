package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzom {
    public static final cskc a = cskc.g("BugleJobs", "PreUploadAttachmentsRecurringWorker");
    private static final cfup n = cfvl.e(cfvl.b, "ditto_max_conversations_to_pre_upload", 25);
    private static final cfup o = cfvl.e(cfvl.b, "ditto_pre_upload_attachments_job_max_messages_per_conversation", 20);
    public final bbgi b;
    public final bznu c;
    public final bcsf d;
    public final errl e;
    public final bcsq f;
    public final bcsy g;
    public final atky h;
    public final int i;
    public final int j;
    public final chdj k;
    public final Optional l;
    public final fazb m;

    public bzom(bbgi bbgiVar, bznu bznuVar, bcsf bcsfVar, cfuu cfuuVar, errl errlVar, bcsq bcsqVar, bcsy bcsyVar, atky atkyVar, chdj chdjVar, Optional optional, fazb fazbVar) {
        this.b = bbgiVar;
        this.c = bznuVar;
        this.d = bcsfVar;
        this.e = errlVar;
        this.f = bcsqVar;
        this.g = bcsyVar;
        this.h = atkyVar;
        this.k = chdjVar;
        this.l = optional;
        this.m = fazbVar;
        cfuuVar.a();
        this.i = ((Integer) n.e()).intValue();
        this.j = ((Integer) o.e()).intValue();
    }
}
