package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcgl {
    public final Context a;
    public final ffbr b;
    public final akzt c;
    public final csum d;
    public final ctap e;
    public final cbar f;
    public final cqoh g;
    public long h;
    private final ffbr i;
    private final ctfj j;

    public dcgl(Context context, ffbr ffbrVar, akzt akztVar, csum csumVar, ctap ctapVar, cbar cbarVar, ffbr ffbrVar2, ctfj ctfjVar, cqoh cqohVar) {
        this.a = context;
        this.b = ffbrVar;
        this.c = akztVar;
        this.d = csumVar;
        this.e = ctapVar;
        this.f = cbarVar;
        this.i = ffbrVar2;
        this.j = ctfjVar;
        this.g = cqohVar;
    }

    public final void a(ea eaVar) {
        this.h = this.g.f().toEpochMilli();
        if (this.j.a()) {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            intent.putExtra("mimeTypes", bdjb.c);
            intent.putExtra("android.intent.extra.LOCAL_ONLY", false);
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            eaVar.startActivityForResult(intent, 1400);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*"});
        intent2.putExtra("mimeTypes", bdjb.a);
        intent2.putExtra("android.intent.extra.LOCAL_ONLY", false);
        intent2.addCategory("android.intent.category.OPENABLE");
        intent2.setType("image/*");
        eaVar.startActivityForResult(intent2, 1400);
    }
}
