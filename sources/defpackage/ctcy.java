package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctcy {
    public final ejlk a;
    public final errl b;
    public final ctec c;
    public final AtomicReference d = new AtomicReference(null);

    public ctcy(ejlk ejlkVar, errl errlVar, ctec ctecVar) {
        this.a = ejlkVar;
        this.b = errlVar;
        this.c = ctecVar;
    }

    public final elfl a(ctci ctciVar) {
        return b(ctciVar, null);
    }

    public final elfl b(final ctci ctciVar, final cxrj cxrjVar) {
        return elfj.d(new erov() { // from class: ctcw
            @Override // defpackage.erov
            public final Object a(erpc erpcVar) {
                ctcy ctcyVar = ctcy.this;
                ctec ctecVar = ctcyVar.c;
                ffbr ffbrVar = ctecVar.a;
                MediaPlayer a = ctef.a();
                Context context = (Context) ffbrVar.b();
                context.getClass();
                errl errlVar = (errl) ctecVar.b.b();
                errlVar.getClass();
                AudioManager audioManager = (AudioManager) ctecVar.c.b();
                audioManager.getClass();
                cteb ctebVar = new cteb(context, errlVar, audioManager, a, ctciVar);
                erpcVar.a(ctebVar, ctcyVar.b);
                return ctebVar;
            }
        }, Looper.myLooper() != null ? erpp.a : new Executor() { // from class: ctcv
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                if (!ctcy.this.a.post(runnable)) {
                    throw new emyx("Could not execute on TiktokHandler");
                }
            }
        }).g(new erot() { // from class: ctcx
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                final cteb ctebVar = (cteb) obj;
                ctebVar.getClass();
                cteb ctebVar2 = (cteb) ctcy.this.d.getAndSet(ctebVar);
                final cxrj cxrjVar2 = cxrjVar;
                return new erph(ctebVar2 != null ? ctebVar2.a("New playback request").i(new eroh() { // from class: ctcu
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return cteb.this.d(cxrjVar2);
                    }
                }, erpp.a) : ctebVar.d(cxrjVar2));
            }
        }, this.b).h();
    }
}
