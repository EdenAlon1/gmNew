package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.mediapipe.framework.AndroidAssetUtil;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketListCallback;
import com.google.mediapipe.tasks.core.ModelResourcesCache;
import com.google.mediapipe.tasks.core.ModelResourcesCacheService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exod implements AutoCloseable {
    public static final /* synthetic */ int d = 0;
    private static final String e = "exod";
    public final Graph a;
    public final AndroidPacketCreator b;
    public exnq c;
    private final exnt f;
    private final AtomicBoolean g;
    private final ModelResourcesCache h;
    private long i;

    private exod(Graph graph, ModelResourcesCache modelResourcesCache, exnt exntVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.g = atomicBoolean;
        this.i = Long.MIN_VALUE;
        this.f = exntVar;
        this.a = graph;
        this.h = modelResourcesCache;
        this.b = new AndroidPacketCreator(graph);
        atomicBoolean.set(true);
    }

    public static exod b(Context context, exnv exnvVar, final exnt exntVar) {
        AndroidAssetUtil.a(context);
        Graph graph = new Graph();
        eulb eulbVar = (eulb) eule.a.createBuilder();
        exnk exnkVar = (exnk) exnvVar;
        eula g = exnkVar.b.g();
        if (g == null) {
            throw new MediaPipeException(exlp.INVALID_ARGUMENT.ordinal(), "Only one of convertTo*Proto() method should be implemented for ".concat(String.valueOf(String.valueOf(exnkVar.b.getClass()))));
        }
        eulc eulcVar = (eulc) euld.a.createBuilder();
        String str = exnkVar.a;
        eulcVar.copyOnWrite();
        ((euld) eulcVar.instance).d = str;
        eulcVar.copyOnWrite();
        euld euldVar = (euld) eulcVar.instance;
        euldVar.g = g;
        euldVar.b |= 1;
        for (String str2 : exnkVar.d) {
            eulcVar.copyOnWrite();
            euld euldVar2 = (euld) eulcVar.instance;
            str2.getClass();
            eygr eygrVar = euldVar2.f;
            if (!eygrVar.c()) {
                euldVar2.f = eyfy.mutableCopy(eygrVar);
            }
            euldVar2.f.add(str2);
            eulbVar.copyOnWrite();
            eule euleVar = (eule) eulbVar.instance;
            str2.getClass();
            eygr eygrVar2 = euleVar.d;
            if (!eygrVar2.c()) {
                euleVar.d = eyfy.mutableCopy(eygrVar2);
            }
            euleVar.d.add(str2);
        }
        for (String str3 : exnkVar.c) {
            eulcVar.copyOnWrite();
            euld euldVar3 = (euld) eulcVar.instance;
            str3.getClass();
            eygr eygrVar3 = euldVar3.e;
            if (!eygrVar3.c()) {
                euldVar3.e = eyfy.mutableCopy(eygrVar3);
            }
            euldVar3.e.add(str3);
            eulbVar.copyOnWrite();
            eule euleVar2 = (eule) eulbVar.instance;
            str3.getClass();
            eygr eygrVar4 = euleVar2.c;
            if (!eygrVar4.c()) {
                euleVar2.c = eyfy.mutableCopy(eygrVar4);
            }
            euleVar2.c.add(str3);
        }
        euld euldVar4 = (euld) eulcVar.build();
        eulbVar.copyOnWrite();
        eule euleVar3 = (eule) eulbVar.instance;
        euldVar4.getClass();
        eygr eygrVar5 = euleVar3.b;
        if (!eygrVar5.c()) {
            euleVar3.b = eyfy.mutableCopy(eygrVar5);
        }
        euleVar3.b.add(euldVar4);
        graph.f((eule) eulbVar.build());
        ModelResourcesCache modelResourcesCache = new ModelResourcesCache();
        graph.i(new ModelResourcesCacheService(), modelResourcesCache);
        ArrayList arrayList = new ArrayList(exnkVar.d.size());
        for (String str4 : exnkVar.d) {
            arrayList.add(str4.substring(str4.lastIndexOf(58) + 1));
        }
        graph.n(arrayList, new PacketListCallback() { // from class: exoc
            @Override // com.google.mediapipe.framework.PacketListCallback
            public final void process(List list) {
                int i = exod.d;
                exnt exntVar2 = exnt.this;
                try {
                    exob a = exntVar2.a.a(list);
                    if (exntVar2.b == null) {
                        exntVar2.d = a;
                        exntVar2.e = ((Packet) list.get(0)).a();
                    } else {
                        exntVar2.a.b(list);
                        exntVar2.b.a();
                    }
                } catch (MediaPipeException e2) {
                    exnq exnqVar = exntVar2.c;
                    if (exnqVar != null) {
                        exnqVar.a(e2);
                    } else {
                        Log.e("OutputHandler", "Error occurs when getting MediaPipe task result. ".concat(e2.toString()));
                    }
                }
                ((Packet) list.get(0)).a();
            }
        });
        graph.j();
        graph.m();
        return new exod(graph, modelResourcesCache, exntVar);
    }

    private final synchronized void c(Map map, long j) {
        if (!this.g.get()) {
            d(new MediaPipeException(exlp.FAILED_PRECONDITION.ordinal(), "The task graph hasn't been successfully started or error occurs during graph initializaton."));
        }
        try {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    this.a.d((String) entry.getKey(), (Packet) entry.getValue(), j);
                    entry.setValue(null);
                }
                for (Packet packet : map.values()) {
                    if (packet != null) {
                        packet.release();
                    }
                }
            } catch (MediaPipeException e2) {
                if (this.c != null) {
                    throw e2;
                }
                Log.e(e, "Mediapipe error: ", e2);
                for (Packet packet2 : map.values()) {
                    if (packet2 != null) {
                        packet2.release();
                    }
                }
            }
        } catch (Throwable th) {
            for (Packet packet3 : map.values()) {
                if (packet3 != null) {
                    packet3.release();
                }
            }
            throw th;
        }
    }

    private final void d(MediaPipeException mediaPipeException) {
        exnq exnqVar = this.c;
        if (exnqVar == null) {
            throw mediaPipeException;
        }
        exnqVar.a(mediaPipeException);
    }

    public final synchronized exob a(Map map) {
        exob exobVar;
        long j = this.i;
        long j2 = j == Long.MIN_VALUE ? 0L : j + 1000000;
        this.i = j2;
        c(map, j2);
        this.a.m();
        exnt exntVar = this.f;
        this.i = exntVar.e;
        exobVar = exntVar.d;
        exntVar.d = null;
        return exobVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.g.get()) {
            try {
                this.g.set(false);
                this.a.e();
                this.a.l();
                ModelResourcesCache modelResourcesCache = this.h;
                if (modelResourcesCache.b.compareAndSet(true, false)) {
                    modelResourcesCache.nativeReleaseModelResourcesCache(modelResourcesCache.a);
                }
            } catch (MediaPipeException e2) {
                d(e2);
            }
            try {
                this.a.k();
            } catch (MediaPipeException e3) {
                d(e3);
            }
        }
    }
}
