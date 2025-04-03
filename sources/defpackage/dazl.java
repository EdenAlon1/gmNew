package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dazl implements TextWatcher {
    final /* synthetic */ String a;
    final /* synthetic */ EditText b;
    final /* synthetic */ dazm c;

    public dazl(dazm dazmVar, String str, EditText editText) {
        this.a = str;
        this.b = editText;
        this.c = dazmVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!dazm.b.containsKey(this.a)) {
            ensk j = dazm.a.j();
            j.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/ui/debug/cloudstore/DebugCmsUtils$5", "onTextChanged", 452, "DebugCmsUtils.java")).t("DebugCmsUtils: Cannot %s using createCmsSettingsEditText", this.a);
        } else {
            final String trim = this.b.getText().toString().trim();
            final String str = this.a;
            elfo.f(new Runnable() { // from class: dazk
                /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[Catch: Exception -> 0x0111, TryCatch #0 {Exception -> 0x0111, blocks: (B:3:0x000e, B:6:0x001e, B:8:0x0024, B:11:0x002c, B:24:0x0065, B:25:0x00f6, B:28:0x006e, B:29:0x0079, B:30:0x007a, B:31:0x0083, B:39:0x009c, B:52:0x00d3, B:53:0x00db, B:54:0x00e6, B:55:0x00e7, B:56:0x00ef), top: B:2:0x000e }] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00ef A[Catch: Exception -> 0x0111, TryCatch #0 {Exception -> 0x0111, blocks: (B:3:0x000e, B:6:0x001e, B:8:0x0024, B:11:0x002c, B:24:0x0065, B:25:0x00f6, B:28:0x006e, B:29:0x0079, B:30:0x007a, B:31:0x0083, B:39:0x009c, B:52:0x00d3, B:53:0x00db, B:54:0x00e6, B:55:0x00e7, B:56:0x00ef), top: B:2:0x000e }] */
                /* JADX WARN: Type inference failed for: r7v14, types: [comc, java.lang.Object] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 307
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dazk.run():void");
                }
            }, this.c.d).k(axnw.b(), this.c.d);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
