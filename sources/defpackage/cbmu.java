package defpackage;

import android.database.Cursor;
import android.database.MergeCursor;
import android.os.CancellationSignal;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmu implements cbmp {
    private static final cskc e = cskc.g("Bugle", "ContactSearchApiImpl");
    public final csqw b;
    public final errl c;
    public final ffbr d;
    private final crnh f;

    public cbmu(crnh crnhVar, csqw csqwVar, errl errlVar, ffbr ffbrVar) {
        this.f = crnhVar;
        this.b = csqwVar;
        this.c = errlVar;
        this.d = ffbrVar;
    }

    @Override // defpackage.cbmp
    public final elfl a(final String str, final int i, final CancellationSignal cancellationSignal) {
        return TextUtils.isEmpty(str) ? elfo.e(new ArrayList()) : elfo.g(new Callable() { // from class: cbms
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Cursor cursor;
                String str2 = str;
                CancellationSignal cancellationSignal2 = cancellationSignal;
                cbmu cbmuVar = cbmu.this;
                csqw csqwVar = cbmuVar.b;
                csqn csqnVar = new csqn(csqw.l(str2) ? csqwVar.h(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI, str2, csqy.a, cancellationSignal2) : csqwVar.i(str2, cancellationSignal2), csqwVar.g(str2, csqy.d(), cancellationSignal2));
                csqz csqzVar = csqnVar.a;
                csqz csqzVar2 = csqnVar.b;
                Cursor cursor2 = ((csqm) csqzVar).a;
                boolean z = true;
                if (cursor2 != null && (cursor = ((csqm) csqzVar2).a) != null && cursor2.getCount() > 0 && cursor.getCount() > 0) {
                    z = false;
                }
                csqz csqzVar3 = csqnVar.a;
                csqz csqzVar4 = csqnVar.b;
                int i2 = engw.d;
                engr engrVar = new engr();
                Cursor cursor3 = ((csqm) csqzVar3).a;
                if (cursor3 != null) {
                    engrVar.h(cursor3);
                }
                Cursor cursor4 = ((csqm) csqzVar4).a;
                if (cursor4 != null) {
                    engrVar.h(cursor4);
                }
                Cursor[] cursorArr = (Cursor[]) engrVar.g().toArray(new Cursor[0]);
                return cbmuVar.b(cursorArr.length == 0 ? null : new MergeCursor(cursorArr), z, i);
            }
        }, this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:5:0x0015, B:10:0x0021, B:52:0x0034, B:19:0x003e, B:21:0x0055, B:24:0x0060, B:26:0x0092, B:28:0x0098, B:31:0x00a6, B:34:0x00bc, B:35:0x00b7, B:38:0x00cb, B:47:0x00d0, B:48:0x00d7), top: B:4:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:5:0x0015, B:10:0x0021, B:52:0x0034, B:19:0x003e, B:21:0x0055, B:24:0x0060, B:26:0x0092, B:28:0x0098, B:31:0x00a6, B:34:0x00bc, B:35:0x00b7, B:38:0x00cb, B:47:0x00d0, B:48:0x00d7), top: B:4:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(android.database.Cursor r27, boolean r28, int r29) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbmu.b(android.database.Cursor, boolean, int):java.util.List");
    }
}
