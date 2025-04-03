package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class avtq extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        FileInformation fileInformation = (FileInformation) obj;
        awva awvaVar = (awva) awvb.a.createBuilder();
        if (fileInformation.h().isPresent() && fileInformation.h().isPresent()) {
            String str = (String) fileInformation.h().get();
            awvaVar.copyOnWrite();
            ((awvb) awvaVar.instance).c = str;
        }
        int a = fileInformation.a();
        awvaVar.copyOnWrite();
        ((awvb) awvaVar.instance).d = a;
        awup awupVar = (awup) avtz.a.m().fP(fileInformation.b());
        awvaVar.copyOnWrite();
        awvb awvbVar = (awvb) awvaVar.instance;
        awupVar.getClass();
        awvbVar.e = awupVar;
        awvbVar.b |= 1;
        String i = fileInformation.i();
        awvaVar.copyOnWrite();
        ((awvb) awvaVar.instance).f = i;
        c(fileInformation, awvaVar);
        return (awvb) awvaVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awvb awvbVar = (awvb) obj;
        eieb eiebVar = new eieb();
        d(awvbVar, eiebVar);
        eiebVar.f(awvbVar.d);
        if ((awvbVar.b & 1) != 0) {
            emwd emwdVar = avtz.a;
            awup awupVar = awvbVar.e;
            if (awupVar == null) {
                awupVar = awup.a;
            }
            eiebVar.c((ContentType) emwdVar.fP(awupVar));
        }
        eiebVar.g(awvbVar.f);
        if ((awvbVar.b & 2) != 0) {
            e(awvbVar, eiebVar);
        }
        return eiebVar.i();
    }

    public abstract void c(FileInformation fileInformation, awva awvaVar);

    public void d(awvb awvbVar, eifi eifiVar) {
        throw null;
    }

    public abstract void e(awvb awvbVar, eifi eifiVar);
}
