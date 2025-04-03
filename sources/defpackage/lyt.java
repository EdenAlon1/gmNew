package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyt {
    public static final /* synthetic */ int a = 0;
    private static final Map b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("TransformerInternal", engw.r("Start"));
        enhdVar.k("AssetLoader", engw.s("InputFormat", "OutputFormat"));
        enhdVar.k("AudioDecoder", engw.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        enhdVar.k("AudioGraph", engw.s("RegisterNewInputStream", "OutputEnded"));
        enhdVar.k("AudioMixer", engw.t("RegisterNewInputStream", "OutputFormat", "ProducedOutput"));
        enhdVar.k("AudioEncoder", engw.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        enhdVar.k("VideoDecoder", engw.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        enhdVar.k("VideoFrameProcessor", engw.z("RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded"));
        enhdVar.k("ExternalTextureManager", engw.s("SignalEOS", "SurfaceTextureTransformFix"));
        enhdVar.k("BitmapTextureManager", engw.r("SignalEOS"));
        enhdVar.k("TexIdTextureManager", engw.r("SignalEOS"));
        enhdVar.k("Compositor", engw.r("OutputTextureRendered"));
        enhdVar.k("VideoEncoder", engw.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        enhdVar.k("Muxer", engw.v("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded"));
        enhdVar.c();
        b = new LinkedHashMap();
        SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String a() {
        synchronized (lyt.class) {
        }
        return "\"Tracing disabled\"";
    }

    public static synchronized void b() {
        synchronized (lyt.class) {
            b.clear();
            SystemClock.elapsedRealtime();
        }
    }
}
