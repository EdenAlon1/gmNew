package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqu implements aqw {
    private final SessionConfiguration a;
    private final List b;

    public aqu(List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        List outputConfigurations;
        aql aqlVar;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, aqx.c(list), executor, stateCallback);
        this.a = sessionConfiguration;
        outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList = new ArrayList(outputConfigurations.size());
        Iterator it = outputConfigurations.iterator();
        while (it.hasNext()) {
            OutputConfiguration m = afg$$ExternalSyntheticApiModelOutline0.m(it.next());
            if (m == null) {
                aqlVar = null;
            } else {
                aqlVar = new aql(Build.VERSION.SDK_INT >= 33 ? new aqs(m) : Build.VERSION.SDK_INT >= 28 ? new aqr(new aqq(m)) : new aqp(new aqo(m)));
            }
            arrayList.add(aqlVar);
        }
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // defpackage.aqw
    public final int a() {
        int sessionType;
        sessionType = this.a.getSessionType();
        return sessionType;
    }

    @Override // defpackage.aqw
    public final CameraCaptureSession.StateCallback b() {
        CameraCaptureSession.StateCallback stateCallback;
        stateCallback = this.a.getStateCallback();
        return stateCallback;
    }

    @Override // defpackage.aqw
    public final aqk c() {
        InputConfiguration inputConfiguration;
        inputConfiguration = this.a.getInputConfiguration();
        return aqk.a(inputConfiguration);
    }

    @Override // defpackage.aqw
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.aqw
    public final List e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqu) {
            return Objects.equals(this.a, ((aqu) obj).a);
        }
        return false;
    }

    @Override // defpackage.aqw
    public final Executor f() {
        Executor executor;
        executor = this.a.getExecutor();
        return executor;
    }

    @Override // defpackage.aqw
    public final void g(aqk aqkVar) {
        this.a.setInputConfiguration((InputConfiguration) aqkVar.b());
    }

    @Override // defpackage.aqw
    public final void h(CaptureRequest captureRequest) {
        this.a.setSessionParameters(captureRequest);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }
}
