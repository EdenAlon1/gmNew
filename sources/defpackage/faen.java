package defpackage;

import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class faen<EffectT> implements faeb {
    public final AndroidPacketCreator e;
    public long f;
    protected final Graph g;
    public final ReentrantReadWriteLock d = new ReentrantReadWriteLock();
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    protected final CopyOnWriteArraySet j = new CopyOnWriteArraySet();
    protected final CopyOnWriteArraySet k = new CopyOnWriteArraySet();

    protected faen(fadq fadqVar) {
        Graph graph = new Graph();
        this.g = graph;
        long j = ((faco) fadqVar).a;
        if (j != 0) {
            try {
                graph.h(j);
            } catch (MediaPipeException unused) {
            }
        }
        this.e = new AndroidPacketCreator(this.g);
    }

    @Override // defpackage.faeb
    public final void hK(faec faecVar) {
        this.d.readLock().lock();
        try {
            faecVar.a(this.f);
        } finally {
            this.d.readLock().unlock();
        }
    }
}
