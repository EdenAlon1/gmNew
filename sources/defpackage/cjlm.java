package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjlm {
    public static final cjlt a(bwjn bwjnVar) {
        bwjnVar.az(0, "work_id");
        cjlk cjlkVar = bwjnVar.a;
        cjlkVar.getClass();
        bwjnVar.az(1, "pipeline_type");
        cjkh cjkhVar = bwjnVar.b;
        cjkhVar.getClass();
        bwjnVar.az(7, "payload");
        byte[] bArr = bwjnVar.h;
        bwjnVar.az(2, "sequencing_key");
        String str = bwjnVar.c;
        bwjnVar.az(6, "client_supplied_id");
        String str2 = bwjnVar.g;
        bwjnVar.az(3, "insertion_timestamp");
        Instant instant = bwjnVar.d;
        instant.getClass();
        bwjnVar.az(5, "execution_state");
        cjli cjliVar = bwjnVar.f;
        cjliVar.getClass();
        bwjnVar.az(4, "execution_attempt_count");
        return new cjlt(cjlkVar, cjkhVar, bArr, str, str2, instant, cjliVar, (int) bwjnVar.e);
    }
}
