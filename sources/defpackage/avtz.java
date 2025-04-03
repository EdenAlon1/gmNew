package defpackage;

import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avtz extends avtq {
    static final emwd a = new avty();

    @Override // defpackage.avtq
    public final void c(FileInformation fileInformation, awva awvaVar) {
        eyja b = eykj.b(fileInformation.d());
        awvaVar.copyOnWrite();
        awvb awvbVar = (awvb) awvaVar.instance;
        awvb awvbVar2 = awvb.a;
        b.getClass();
        awvbVar.g = b;
        awvbVar.b |= 2;
    }

    @Override // defpackage.avtq
    public final void d(awvb awvbVar, eifi eifiVar) {
        if (awvbVar.c.isEmpty()) {
            return;
        }
        eifiVar.e(awvbVar.c);
    }

    @Override // defpackage.avtq
    public final void e(awvb awvbVar, eifi eifiVar) {
        eyja eyjaVar = awvbVar.g;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        eifiVar.h(eykj.d(eyjaVar));
    }
}
