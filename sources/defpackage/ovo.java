package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ovo {
    public static final void a(ouz ouzVar) {
        fffs fffsVar = new fffs((byte[]) null);
        ovi a = ouzVar.a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (a.j()) {
            try {
                fffsVar.add(a.d(0));
            } finally {
            }
        }
        ffit.a(a, null);
        for (String str : ffdx.a(fffsVar)) {
            if (ffpc.t(str, "room_fts_content_sync_")) {
                oxe.a(ouzVar, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }
}
